
export default class login{
    data="Login done";
}

interface User {
    readonly dbId: number;

}
interface User{
    name: string;
    email: string;
    password: string;
}
const info: User = {dbId: 22, name: "sanket", email: "sanket@gmail.com", password: "sanket"};
console.log(info);



