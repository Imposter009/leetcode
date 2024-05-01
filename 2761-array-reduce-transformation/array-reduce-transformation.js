/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    // var init;
    for(var a of nums){
        init=fn(init,a);
    }
    return init;
};