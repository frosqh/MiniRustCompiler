fn puissance(a : i32, b: i32) -> i32
{
	if b == 0
	{
		return 1;
	}

	let mut i = 1;
	let mut result = a;
	while i < b
	{
		result = result * a;
		i = i+1;
	}
	return result;
}

fn factorielle(n : i32, result : &i32)
{
	let mut i = 1;
	if n==0
	{
		*result = 1;

	} else{
        *result = 1;
		while i <= n
		{
			*result = *result * i;
			i = i+1;
		}
	}
}

fn main(){
	let factorielle = 83 ;
	let mut v = 0;
	factorielle(5,&v);
	print!(v);
}