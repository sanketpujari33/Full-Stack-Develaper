"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
// export {}
var App = /** @class */ (function () {
    function App() {
    }
    App.prototype.test = function () {
        console.log("Test function working");
    };
    return App;
}());
var x = new App();
x.test();
// Types in TypeScripts
var aa = 10;
console.log(aa);
var b = 10;
console.log(b);
var c = "hello";
console.log(c);
var d = true;
console.log(d);
// Array in TypeScripts
var data = ["sanket", "Pujari", "Shekhar", "Nitin", 10, false];
data.push(true);
data[3] = 67;
console.log(data);
var DataString = ["sanket", "Pujari", "Shekhar", "Nitin"];
// DataString.push(554114)
console.log(DataString);
var e = [1, 2, 3, 4, 5];
console.log(e);
var f = ["hello", "world"];
console.log(f);
var users = {
    name: "Sanket",
    age: 20,
    address: "1234,A.nager",
    phone: ["123-123-1234", "345-345-3456", "987-987-8789"],
    email: "sanket@gmail.com",
};
console.log(users);
var users2 = {
    name: 4545,
    age: "efwf",
    address: "1234,A.nager",
    phone: ["123-123-1234", "345-345-3456", "987-987-8789"],
    email: true,
};
console.log(users2);
var user3 = {
    name: "Sanket",
    age: 25,
};
console.log(user3);
// Union in TypeScripts
var g = 10;
console.log(g);
var h = "hello";
console.log(h);
var l = 1321;
console.log(l);
var k = {
    name: "Sanket",
    age: 25,
    getName: function () {
        return "Sanket";
    },
};
console.log(k);
console.log(k.getName());
// Function in TypeScripts
function cls(A, B) {
    return B ? A + B : A;
}
console.log(cls(522));
var j = function (a, b) { return a + b; };
console.log(j(30, 20));
// class in TypeScripts
var AppTest = /** @class */ (function () {
    function AppTest(name) {
        this.name = name;
    }
    AppTest.prototype.getName = function () {
        console.log(this.name);
    };
    return AppTest;
}());
var obj = new AppTest("Sanket");
obj.getName();
var UserT = /** @class */ (function () {
    function UserT(name, age) {
        this.name = name;
        this.age = age;
    }
    UserT.prototype.getName = function () {
        console.log(this.name);
    };
    UserT.prototype.getAge = function () {
        return this.age;
    };
    return UserT;
}());
var userTest = new UserT("Sanket", 20);
userTest.getName();
console.log(userTest.getAge());
// Inheritance in TypeScripts
var Parent = /** @class */ (function () {
    function Parent() {
    }
    Parent.prototype.setName = function (name) {
        return (this.name = name);
    };
    return Parent;
}());
var Child = /** @class */ (function (_super) {
    __extends(Child, _super);
    function Child() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Child.prototype.getName = function () {
        return this.name;
    };
    return Child;
}(Parent));
var child = new Child();
child.setName("sanket");
console.log(child.getName());
// Namespace in TypeScript
var MyApp;
(function (MyApp) {
    var UserApp = /** @class */ (function () {
        function UserApp() {
        }
        UserApp.prototype.setName = function (name) {
            return (this.name = name);
        };
        UserApp.prototype.getName = function () {
            return this.name;
        };
        return UserApp;
    }());
    MyApp.UserApp = UserApp;
})(MyApp || (MyApp = {}));
var userApp = new MyApp.UserApp();
userApp.setName("Sanket namespace");
console.log(userApp.getName());
/// <reference path="./utils.ts" />
var UserUtils;
(function (UserUtils) {
    var User = /** @class */ (function (_super) {
        __extends(User, _super);
        function User() {
            return _super !== null && _super.apply(this, arguments) || this;
        }
        User.prototype.getName = function () {
            return this.name;
        };
        return User;
    }(Parent));
    UserUtils.User = User;
})(UserUtils || (UserUtils = {}));
var u1 = new UserUtils.User();
u1.setName("Sanketnjd");
console.log(u1.getName());
var student_1 = require("./student");
var Teacher_1 = require("./Teacher");
var Teacher = new Teacher_1.default();
console.log(Teacher.data);
var Student = new student_1.default();
console.log(Student.data);
// Generics in TypeScript
function usersGenerics(data) {
    return data;
}
console.table(usersGenerics({ name: "sanket", password: "sanket" }));
// Enum in TypeScripts
var Color;
(function (Color) {
    Color[Color["Red"] = 0] = "Red";
    Color[Color["Green"] = 1] = "Green";
    Color[Color["Blue"] = 2] = "Blue";
    Color[Color["Yellow"] = 3] = "Yellow";
    Color[Color["Black"] = 4] = "Black";
})(Color || (Color = {}));
var m;
m = Color.Red;
console.log(m);
function whichColor(color) {
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
var q = [1, "hello"];
q.push(true);
q[1] = "one";
console.log(g);
//Literal Types in TypeScript
function combine(a, b, type) {
    if (type === "as-number") {
        return (+a) + (+b);
    }
    else {
        return a.toString() + b.toString();
    }
}
console.log(combine(10, 55, "as-number"));
// console.log(combine(545,"vbbvkhds"));
console.log(combine("gdjxdd", "khcdhc", "as-string"));
var a1 = 10;
var b2 = 20;
var c3 = undefined;
var d4 = "Sanket";
// Function Type return in TypeScript
function add(a, b) {
    return a + b;
}
// Function Type void in TypeScript
function add1(a, b) {
    console.log(a + b);
}
// Unknown in TypeScript
var dataUnknown;
dataUnknown = 10;
dataUnknown = "hello";
var item;
if (typeof data === "string") {
    item = data;
}
// never type in types
function tryReturn() {
    // return true;
}
console.log(tryReturn());
function apiError(msg, code) {
    throw { msg: msg, code: code };
}
console.log(apiError("server side error: ", 500));
// Watch mode in TypeScript
// tsc.cmd app.ts --watch
// Compile  and use Multiple files
// Target Configuration
