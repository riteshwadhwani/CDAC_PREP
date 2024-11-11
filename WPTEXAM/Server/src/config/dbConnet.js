import {createConnection} from 'mysql2';

export function getConnection(){
    return createConnection({
        host: "localhost",
        user: "root",
        password: "cdac",
        database: "practice"
    });
}

export function establishConnection(){
    var connection = getConnection();
    connection.connect((error)=>{
        if(error){
            console.log(error);
        }
        else{
            console.log("Connected to DB")
        }
    })
}
