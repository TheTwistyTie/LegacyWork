import java.util.Scanner;
class decode{
	public static void main(String[] args){
		String input = " ", letter = " "; output = " ";
		int length = 0, x, key, wLength, y=0, temp=0;
		Boolean isLastZero = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("What do you want to decrypt?");
		input = scan.next();
		System.out.println("What is the key? (int)");
		key = scan.nextInt();
		String[] segments = input.split("\\\\");
		length = segments.length;
		int[] segment = new int[length];
		String[] nletter = new String[0];
		for(x=0; x<length; x++){
			segment[x] = Integer.parseInt(segments[x]);
		}
		int[] unkey = new int[length];
		for(x=0; x<length; x++){
			unkey[x] = segment[x] / key;
			segments[x] = Integer.toString(unkey[x]);
			wLength = segments[x].length();
			for(y=0; y<wLength; y++){
				if(charAt(y)==0){
					if(isLastZero == false){
						isLastZero = true;
					}
					else{
						nletter[x] = nletter[x] + segments[x].charAt(y);
					}
				}
			}
			switch(nletter[x]){
				case 100:
					letter = "a";
					break;
				case 110:
					letter = "b";
					break;
				case 120:
					letter = "c";
					break;
				case 130:
					letter = "d";
					break;
				case 140:
					letter = "e";
					break;
				case 150:
					letter = "f";
					break;
				case 160:
					letter = "g";
					break;
				case 170:
					letter = "h";
					break;
				case 180:
					letter = "i";
					break;
				case 190:
					letter = "j";
					break;
				case 200:
					letter = "k";
					break;
				case 210:
					letter = "l";
					break;
				case 220:
					letter = "m";
					break;
				case 230:
					letter = "n";
					break;
				case 240:
					letter = "o";
					break;
				case 250:
					letter = "p";
					break;
				case 260:
					letter = "q";
					break;
				case 270:
					letter = "r";
					break;
				case 280:
					letter = "s";
					break;
				case 290:
					letter = "t";
					break;
				case 300:
					letter = "u";
					break;
				case 310:
					letter = "v";
					break;
				case 320:
					letter = "w";
					break;
				case 330:
					letter = "x";
					break;
				case 340:
					letter = "y";
					break;
				case 350:
					letter = "z";
					break;
				case 360:
					letter = ".";
					break;
				case 370:
					letter = ",";
					break;
				case 380:
					letter = "?";
					break;
				case 390:
					letter = "\'";
					break;
			}
			output = output + letter;
		}

		System.out.println(output);

	}
}