/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
	//since args is an array of arguments, simply return the length
	return args.length;
};
