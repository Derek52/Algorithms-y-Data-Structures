fn main() {
    let mut array = [77, 23, 11, 145, 7, 48, -27, 17];
    modify(&mut array);
    for x in array.iter() {
        println!("The value is {}", x);
    }
}

fn modify(arr: &mut [i32]) {

    for x in (0..arr.len()).rev(){
        for y in 0..x {
            let a = arr[y];
            let b = arr[y+1];
            if a > b {
                let temp = a;
                arr[y] = b;
                arr[y+1] = temp;
            }
        }
    }
}
