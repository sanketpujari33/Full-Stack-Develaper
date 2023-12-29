const user ={
    username: "Sanket",
    loginCount: 8,
    sihgnredIn: true,
}


let obj={1:[1,2,3,4,5,6], 2: [7,8,9,10,11,12], 3:[1,2,3,4,5,6]};
for (let j=1; j<=3 ; j++) {
obj[j].map((i)=>{
    console.log(i);
})
}