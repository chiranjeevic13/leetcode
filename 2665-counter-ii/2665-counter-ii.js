/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let count = init || 0; // initialize count to 0 or given value

  const increment = function() {
    count++;
    return count;
  };

  const decrement = function() {
    count--;
    return count;
  };

  const reset = function() {
    count = init || 0;
    return count;
  };

  return { increment, decrement, reset };
};
