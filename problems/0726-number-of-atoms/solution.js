/**
 * @param {string} formula
 * @return {string}
 */
var countOfAtoms = function(formula) {
    const n = formula.length;
    const resultCounter = {};
    const parenthesisStack = [];
    let curInd =0;

    while(curInd < n){
        let curChar = formula[curInd];

        if(curChar === '(') {
            curInd++;
            parenthesisStack.push({});
            continue;
        }

        if(curChar === ')') {
            let multStr = '';
            curInd++;

            while(curInd < n && isDigit(formula[curInd])) {
                multStr += formula[curInd];
                curInd++;
            }

            const mult = multStr === '' ? 1: parseInt(multStr, 10);
            const lastCounter = parenthesisStack.pop();
            const target = parenthesisStack.length === 0 ? resultCounter : parenthesisStack[parenthesisStack.length - 1];

            for(const [elem , counter] of Object.entries(lastCounter)){
                if(!(elem in target) ) {
                    target[elem] = 0;
                }
                target[elem] += counter * mult;
            }
            continue;

        }

        let curElem = '';
        let curCounterStr = '';
        let target = parenthesisStack.length === 0 ? resultCounter : parenthesisStack[parenthesisStack.length - 1];

        while (curInd < n && formula[curInd] !== '(' && formula[curInd] !== ')'){
            if(isAlpha(formula[curInd])){
                if(isUpper(formula[curInd]) && curElem !== ''){
                    if(!(curElem in target)) {
                        target[curElem] = 0;
                    }
                    target[curElem] += curCounterStr === '' ? 1 : parseInt(curCounterStr, 10);
                    curElem = "";
                    curCounterStr = '';
                }
                curElem += formula[curInd];
            } else {
                curCounterStr += formula[curInd];
            }
            curInd++;
        }

        if (!(curElem in target)) {
            target[curElem] = 0;
        }
        target[curElem] += curCounterStr === '' ? 1 : parseInt(curCounterStr, 10);
    }
    const parts = [];
    for (const [elem, counter] of Object.entries(resultCounter)) {
        parts.push(elem + (counter === 1 ? '' : counter));
    }
    parts.sort();

    return parts.join('');
};

function isDigit(char) {
    return char >= '0' && char <= '9';
}

function isAlpha(char) {
    return char.toLowerCase() !== char.toUpperCase();
}

function isUpper(char) {
    return char === char.toUpperCase();
}
