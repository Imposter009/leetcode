/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
    var arr=args
    return arr.length
};

/**
 * argumentsLength(1, 2, 3); // 3
 */