namespace UserUtils{
    export class Parent{
        name;
        setName(name): string {
            return this.name = name;
        }
    }
    export interface userType{
        getName(); 
    }
}