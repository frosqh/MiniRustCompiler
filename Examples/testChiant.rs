fn chiant3()->i32{
	return 3+1;
}

fn chiant2()->i32{
	print!("lali",chiant3());
	return 2;
}

fn chiant1(i : i32)->i32{
	if(i==1){
		print!("plicploc");
		print!(chiant2());
		return 1;
	}
	if(i==0){
		return chiant1(1);

	}
	else{
		return 0;
	}
}

fn main(){
	print!(chiant1(0));
}