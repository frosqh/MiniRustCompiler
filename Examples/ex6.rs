fn test(v : &vec<i32>) -> i32 {
    print!(*v[0]);
    return *v[1]+5;
}

fn main(){
    let w = vec![5,6,2];
    print!(test(&w));
}
