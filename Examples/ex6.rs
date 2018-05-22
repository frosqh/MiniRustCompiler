fn test(v : &vec<i32>){
    let d = *v;
    print!(d[2]);
}

fn main(){
    let w = vec![1,2,3];
    test(&w);
}
