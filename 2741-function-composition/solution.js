/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    if (functions.length === 0 ){
        return function(x) { return x; };
    }
    
	return function(x) {
        //computing initial result value as result of last function
        var result = functions[functions.length-1](x);
        for (var i = functions.length - 2;i >= 0; i--) {
            // updating result values by passing it as paramater
            // to each function call from left to right
            result = functions[i](result);
        }
        return result;
    }
};


