var sortJumbled = function(mapping, nums) {
    const translateInteger = (num) => {
        if (num === 0) {
            return mapping[0];
        }
        let res = 0;
        let curMult = 1;
        while (num > 0) {
            const digit = num % 10;
            num = Math.floor(num / 10);
            res += mapping[digit] * curMult;
            curMult *= 10;
        }
        return res;
    };

    const numberMapping = {};
    for (let num of nums) {
        if (!(num in numberMapping)) {
            numberMapping[num] = translateInteger(num);
        }
    }

    nums.sort((a, b) => numberMapping[a] - numberMapping[b]);

    return nums;
};
