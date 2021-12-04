function howMuchIncreased(values) {

    var result = 0;

    for(var i = 1; i < values.length ; i++) {
        if(values[i] > values[i-1]) {
            result++;
        }
    }
    return result;
}
exports.howMuchIncreased = howMuchIncreased;