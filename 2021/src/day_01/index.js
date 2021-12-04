function howMuchIncreased(values) {

    var result = 0;

    for(var i = 1; i < values.length ; i++) {
        if(values[i] > values[i-1]) {
            result++;
        }
    }
    return result;
}

function threePreviousValues(values, index){
    return values[index] + values[index - 1] + values[index - 2];
}

function howMuchSmoothlyIncreased(values) {

    var result = 0;

    for(var i = 3; i < values.length ; i++) {
        if(threePreviousValues(values, i) > threePreviousValues(values, i-1)) {
            result++;
        }
    }
    return result;
}



exports.howMuchIncreased = howMuchIncreased;
exports.howMuchSmoothlyIncreased = howMuchSmoothlyIncreased;