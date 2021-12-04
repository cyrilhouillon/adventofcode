function nPreviousValues(values, index, n = 2){
    return Array.from({length: n}, (_, i) => values[index - i]).reduce((pv, cv) => pv + cv, 0);
}

function increment(values, slidingWindow = 3) {

    var result = 0;

    for(var i = slidingWindow; i < values.length ; i++) {
        if(nPreviousValues(values, i, slidingWindow) > nPreviousValues(values, i-1, slidingWindow)) {
            result++;
        }
    }
    return result;
}



exports.howMuchIncreased = (values) => increment(values, 1);
exports.howMuchSmoothlyIncreased = (values) => increment(values, 3);