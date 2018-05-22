fn test(v : &vec<i32>){
    let mut d = *v;
    d[2] = 52;
    if (true){
        print!(d[1]);
    }
    print!("Hey ! ");
}

fn testBis(v : &vec<i32>){
   let mut d= *v;
   print!("Hey Bis ! ");
}

fn main(){
    let w = vec![1,2,3];
    print!("Avant : ",w[2]);
    testBis(&w);
    print!("Bis : ",w[2]);
    test(&w);
    print!(w[2]);
}
