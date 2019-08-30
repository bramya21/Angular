import { Maths } from './maths';

// describe('Maths', () => {
//   it('should create an instance', () => {
//     expect(new Maths()).toBeTruthy();
//   });
// });

describe('Test Maths by adding functionality', () => {
  let obj=new Maths();
  it("True equals true",()=>{
    expect(true).toBeTruthy();
    expect(true).toBe(true);
  });
  it('should create an object', () => {
    expect(obj).toBeTruthy();
    expect(obj).toBeDefined();
  });
  it("Should add 2 numbers",()=>{
    let n1=10;let n2=20;
    expect(obj.Add(n1,n2)).toEqual(30);
  });
  it("Should subtract 2 numbers if one number is negative",()=>{
    let n1=10;let n2=-20;
    expect(obj.Add(n1,n2)).toEqual(-10);
  });
  it("Should subtract 2 numbers",()=>{
    let n1=30;let n2=20;
    expect(obj.Subtract(n1,n2)).toEqual(10);
  });
  it("Should multiply 2 numbers",()=>{
    let n1=30;let n2=20;
    expect(obj.Multiply(n1,n2)).toEqual(600);
  });
  it("Should divide 2 numbers",()=>{
    let n1=30;let n2=20;
    expect(obj.Divide(n1,n2)).toEqual(1.5);
  });
});
