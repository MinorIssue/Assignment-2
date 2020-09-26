import java.util.Scanner;
class RandomNumGuesser{
public static void main(String[] args){
Scanner snr = new Scanner(System.in); {
	int randNum, nextGuess, highGuess = 100, lowGuess = 0;
	RNG rng = new RNG();
	randNum = RNG.rand();
	System.out.println("Enter a number between 0 and 100 : ");
	nextGuess = snr.nextInt();
	while(nextGuess != randNum){
	if ((int)RNG.getCount()/2 != 0)
	System.out.println("Number of gesses " +(int)RNG.getCount()/2);
	while(!RNG.inputValidation(nextGuess, lowGuess, highGuess)){
	nextGuess = snr.nextInt();
	}
	if (nextGuess > randNum)
	highGuess = nextGuess;
	else if (nextGuess < randNum)
	lowGuess = nextGuess;
	}
	if (nextGuess == randNum){
	System.out.println("Your guess is correct!");
	System.out.println("Do you wanna try again? 1 for yes and 0 for no :" );
		if (snr.nextInt() == 1){
	RNG.resetCount();
	main(args);
	}
	else
	System.exit(0);
	}
}
}
}
