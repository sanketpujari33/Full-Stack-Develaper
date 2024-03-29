// export {}
class App {
    test() {
        console.log("Test function working");
    }
}
let x = new App();

x.test();

// Types in TypeScripts

const aa = 10;
console.log(aa);

const b: number = 10;

console.log(b);

let c: string = "hello";
console.log(c);

let d: boolean = true;

console.log(d);

// I_Array in TypeScripts

let data = ["sanket", "Pujari", "Shekhar", "Nitin", 10, false];
data.push(true);
data[3] = 67;
console.log(data);

let DataString: string[] = ["sanket", "Pujari", "Shekhar", "Nitin"];
// DataString.push(554114)
console.log(DataString);

let e: I_Array<number> = [1, 2, 3, 4, 5];
console.log(e);

let f: I_Array<string> = ["hello", "world"];
console.log(f);

// Object in TypeScripts
interface usersTyped {
    name: string;
    age: number;
    address: string;
    phone: string[];
    email: string;
}
let users: usersTyped = {
    name: "Sanket",
    age: 20,
    address: "1234,A.nager",
    phone: ["123-123-1234", "345-345-3456", "987-987-8789"],
    email: "sanket@gmail.com",
};
console.log(users);
let users2: any = {
    name: 4545,
    age: "efwf",
    address: "1234,A.nager",
    phone: ["123-123-1234", "345-345-3456", "987-987-8789"],
    email: true,
};
console.log(users2);

let user3: {
    name: string;
    age: number;
} = {
    name: "Sanket",
    age: 25,
};

console.log(user3);

// Union in TypeScripts

let g: string | number = 10;
console.log(g);

let h: string | number = "hello";
console.log(h);

let l: string | number = 1321;

console.log(l);

// Interface in TypeScripts

interface Person {
    name: string;
    age: number;
    getName: () => string;
}

let k: Person = {
    name: "Sanket",
    age: 25,
    getName: () => {
        return "Sanket";
    },
};
console.log(k);
console.log(k.getName());

// Function in TypeScripts
function cls(A: number, B?: number): number {
    return B ? A + B : A;
}
console.log(cls(522));

let j: (a: number, b: number) => number = (a, b) => a + b;

console.log(j(30, 20));

// class in TypeScripts

class AppTest {
    name;
    constructor(name) {
        this.name = name;
    }
    getName() {
        console.log(this.name);
    }
}

let obj = new AppTest("Sanket");
obj.getName();

class UserT {
    name: string;
    age: number;
    constructor(name: string, age: number) {
        this.name = name;
        this.age = age;
    }
    getName(): void {
        console.log(this.name);
    }
    getAge(): number {
        return this.age;
    }
}

let userTest = new UserT("Sanket", 20);

userTest.getName();
console.log(userTest.getAge());

// Inheritance in TypeScripts
class Parent {
    name;
    setName(name): string {
        return (this.name = name);
    }
}

class Child extends Parent {
    getName(): string {
        return this.name;
    }
}
let child = new Child();
child.setName("sanket");
console.log(child.getName());

// Namespace in TypeScript

namespace MyApp {
    export class UserApp {
        name;
        setName(name): string {
            return (this.name = name);
        }
        getName(): string {
            return this.name;
        }
    }
}

let userApp = new MyApp.UserApp();

userApp.setName("Sanket namespace");

console.log(userApp.getName());


/// <reference path="./utils.ts" />

namespace UserUtils{
    export class User extends Parent implements userType{
        getName(): string {
            return this.name;
        }
    }

}

let u1 = new UserUtils.User();

u1.setName("Sanketnjd");

console.log(u1.getName());

import loginS  from "./student";
import loginT from "./Teacher";

let Teacher= new loginT();
console.log(Teacher.data)
let Student = new loginS();
console.log(Student.data)

// Generics in TypeScript

function usersGenerics<T>(data:T):T{
    return data
}

console.table(usersGenerics({name:"sanket",password:"sanket"}));


// Enum in TypeScripts

enum Color {
    Red,
    Green,
    Blue,
    Yellow,
    Black,

}
let m: Color ;
m = Color.Red;
console.log(m);

function whichColor(color: Color) {
    switch (color) {
        case Color.Red:
            console.log("Red");
            break;
        case Color.Green:
            console.log("Green");
            break;
        case Color.Blue:
            console.log("Blue");
            break;
        case Color.Yellow:
            console.log("Yellow");
            break;
        case Color.Black:
            console.log("Black");
            break;
    }
}
whichColor(m);

//Symbol in TypeScript

// let s1 = Symbol("d1");
// let s2 = Symbol("d2");
// console.log(s1.toString);

// let datab = {
//     name: "Sanket",
//     age: 25,
//     [s1]: "sanket",
//     [s2]: "sanket",
// }

// console.log(datab[s1]);

// Configration file in TypeScript

// let config = {
//     name: "Sanket",
//     age: 25,
//     [Symbol.toStringTag]: "Sanket",
//     [Symbol.iterator]: Symbol.iterator,
//     [Symbol.unscopables]: Symbol.unscopables,
//     [Symbol.toPrimitive]: Symbol.toPrimitive,
//     [Symbol.hasInstance]: Symbol.hasInstance,
//     [Symbol.isConcatSpreadable]: Symbol.isConcatSpreadable,
//     [Symbol.match]: Symbol.match,
//     [Symbol.replace]: Symbol.replace,
// }

// Tuple in TypeScripts

let q: [number, string, boolean?] = [1, "hello"];
q.push(true);
q[1]="one";
console.log(g);

//Literal Types in TypeScript

function combine(a: number | string, b: number | string, type: "as-number" | "as-string"){
    if(type === "as-number"){
        return (+a) + (+b);
    }
    else{
        return a.toString() + b.toString();
    }

}
console.log(combine(10,55, "as-number"));
// console.log(combine(545,"vbbvkhds"));
console.log(combine("gdjxdd", "khcdhc", "as-string"));

// Alias in TypeScript
type varType= string | number | undefined;
let a1 : varType = 10;
let b2 : varType =20;
let c3 : varType =undefined;
let d4 : varType ="Sanket";

// Function Type return in TypeScript

function add(a: number, b: number): number {
    return a + b;
}

// Function Type void in TypeScript

function add1(a: number, b: number): void {
    console.log(a + b);
}

// Unknown in TypeScript

let dataUnknown : unknown;
dataUnknown = 10;
dataUnknown = "hello";
let item: string;
if (typeof data === "string") {
    item = data;
}

// never type in types
function tryReturn(){
    // return true;
}
console.log(tryReturn());

    function apiError(msg, code): never{
        throw {msg: msg, code: code};
}
console.log(apiError("server side error: " ,500));

// Watch mode in TypeScript
// tsc.cmd app.ts --watch

// Compile  and use Multiple files

// Target Configuration

