const {howMuchIncreased, howMuchSmoothlyIncreased} = require('./index.js');

test('test should wordk', () => {
    expect(1).toBe(1);
});

describe('Day 01', () => {
    let exempleValues = [199,200,208,210,200,207,240,269,260,263];
    
    let fs = require('fs');
    let data = fs.readFileSync('src/day_01/raw.txt').toString().split("\n").map( (value) => parseInt(value, 10) );

    test('should compute example values', () => {
        expect(howMuchIncreased(exempleValues)).toBe(7);
    });
    
    test('waht the first answer jammy!', () => {        
        expect(howMuchIncreased(data)).toBe(1475);
    });
    
    test('should compute smoothly example values', () => {
        expect(howMuchSmoothlyIncreased(exempleValues)).toBe(5);
    });
    
    test('so the second answer!', () => {        
        expect(howMuchSmoothlyIncreased(data)).toBe(1516);
    });

});
