const {howMuchIncreased} = require('./part1.js');

test('test should wordk', () => {
    expect(1).toBe(1);
});

test('should compute example values', () => {
    let exempleValues = [199,200,208,210,200,207,240,269,260,263];
    expect(howMuchIncreased(exempleValues)).toBe(7);
});

test('waht the first answer jammy!', () => {
    var fs = require('fs');
    var data = fs.readFileSync('src/day_01/part1_raw.txt').toString().split("\n").map( (value) => parseInt(value, 10) );

    expect(howMuchIncreased(data)).toBe(1475);
});
