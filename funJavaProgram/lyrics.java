import java.util.*;
import javax.sound.sampled.*;
import java.io.File;

public class lyrics {
    static String start;

    public static void main(String[] args) {
        new lyrics();
    }

    public lyrics() {
        try {
            File file = new File("Sorry.wav"); // Replace with the new audio file
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            SongLines call = new Line();

            Scanner scan = new Scanner(System.in);

            System.out.print("Press any key to play Sorry: ");
            start = scan.next();
            clip.start();
            call.FirstLine();
            Clear();
            call.SecondLine();
            Clear();
            call.ThirdLine();
            Clear();
            call.FourthLine();
            Clear();
            call.FifthLine();
            Clear();
            call.SixthLine();
            Clear();
            call.SeventhLine();
            Clear();
            call.EighthLine();
            Clear();
            call.NinthLine();
            Clear();
            call.tenLine();
            Clear();
            call.NinthLine();
            Clear();
            call.elevenLine();
            Clear();
            call.nowLine();
            Clear();
            call.twelvLine();
            Clear();
            call.thertenLine();
            Clear();




            System.out.println("Repeat the program? (Yes/No)");
            start = scan.next();

            if (start.equalsIgnoreCase("Yes")) {
                new lyrics();
            } else if (start.equalsIgnoreCase("No")) {
                System.out.println("Thank You!!");
            } else {
                System.out.println("Invalid Response");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static abstract class SongLines {
        public abstract void FirstLine();

        public abstract void SecondLine();

        public abstract void ThirdLine();

        public abstract void FourthLine();

        public abstract void FifthLine();

        public abstract void SixthLine();

        public abstract void SeventhLine();

        public abstract void EighthLine();

        public abstract void NinthLine();


        public abstract void tenLine();

        public abstract void elevenLine();

        public abstract void twelvLine();

        public abstract void thertenLine();
        public abstract void nowLine();
    }

    public static class Line extends SongLines {

        @Override
        public void FirstLine() {
            try {
                Thread.sleep(9000);
                System.out.println("You gotta go and get angry at all of my honesty");
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void SecondLine() {
            try {
                Thread.sleep(3000);
                System.out.println("You know I try, but I don't do too well with apologies");
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void ThirdLine() {
            try {
                Thread.sleep(3000);
                System.out.println("I hope I don't run out of time, could someone call a referee?");
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void FourthLine() {
            try {
                Thread.sleep(3000);
                System.out.println("'Cause I just need one more shot at forgiveness");
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void FifthLine() {
            try {
                Thread.sleep(2500);
                System.out.println("I know you know that I made those mistakes maybe once or twice");
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void SixthLine() {
            try {
                Thread.sleep(2500);
                System.out.println("And by once or twice, I mean maybe a couple of hundred times");
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void SeventhLine() {
            try {
                Thread.sleep(2600);
                System.out.println("So let me, oh, let me redeem, oh, redeem, oh, myself tonight");
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void EighthLine() {
            try {
                Thread.sleep(3000);
                System.out.println("'Cause I just need one more shot at second chances");
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void NinthLine() {
            try {
                Thread.sleep(3000);
                System.out.println("Yeah, is it too late now to say sorry?");
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        @Override
        public void tenLine() {
            try {
                Thread.sleep(3000);
                System.out.println("'Cause I'm missing more than just your body");
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        @Override
        public void elevenLine() {
            try {
                Thread.sleep(2500);
                System.out.println("Yeah, I know that I let you down");
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        public void nowLine() {
            try {
                Thread.sleep(1000);
                System.out.println("Is it too late to say I'm sorry now?");
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        @Override
        public void twelvLine() {
            try {
                Thread.sleep(3000);
                System.out.println("I'm sorry, yeah");
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        @Override
        public void thertenLine() {
            try {
                Thread.sleep(3000);
                System.out.println("Yeah, is it too late now to say sorry?");
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static void Clear() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
