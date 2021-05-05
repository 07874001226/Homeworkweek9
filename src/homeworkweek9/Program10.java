package homeworkweek9;

import java.util.HashMap;
import java.util.Scanner;

/*Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name.
 */
public class Program10 {

    //Main Method
    public static void main(String[] args) {
//creat a hasmap object
        HashMap<String, String> tube = new HashMap<>();
        //Add keys and value
        tube.put("Bank", "\nNorthern Line\nWaterloo & City,\nDLR");
        tube.put("Bond Street", "\nJubilee Line\nCentral Line");
        tube.put("Lancaster Gate", "\nCentral Line");
        tube.put("Paddington", "\nCircle Line\nDistrict Line,\nBakerloo Line,\nHammersmith & City Line");
        tube.put("Pimlico", "\nVictoria line");
        tube.put("Temple", "\nCircle Line,\nDistrict Line");
        tube.put("West Minster", "\nCircle Line,\nDistrict Line\nJubilee Line");
        tube.put("Vauxhall", "\nVictoria Line\nOver ground");
        tube.put("Waterloo", "\nBakerloo Line\nWaterloo & City,\nNorthern line,\nOverground");
        tube.put("Kings Cross", "\nNorthern Line\nVictoria Line,\nBritish Rail");
//scanner class object creat
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the station name; \nBank,Bond Street,Lancaster Gate,Paddington,Pimlico" +
                "\nTemple,West Minster,Vauxhall,Waterloo,Kings Cross");
        String tfl = sca.nextLine();
        //print statement
        System.out.println("Entered Station in Zone 1 " + tube.get(tfl));
    }
}

        // Victoria, Green Park, Hyde Park, Oxford Circus,Aldgate, Goods street,
        // Great Portland, Barbican,Regent Park,Edgware Road, Goods Street,Euston,
        // Old Street, London Bridge, elephant Castle, Angel,Fulham, Westminster
        // Vauxhall, Waterloo, Tower Gateway, Embankment, Cannon Street,
        // Mansion House, Monument , St Paul, Liverpool Street,Lancaster Gate,Hammersmith, South Kensington,
        //Kensington,Kingscross, Picaddily, Oval,

        //Bakerloo Line, , Victoria Line,  Bakerloo Line
        // Central Line, Circle Line, District Line, Hammersmith & City Line, Jubilee Line,
        //Metropolitan Line, Northern Line, Piccadilly Line, Victoria Line, Waterloo & City Line,
        //Northen Line, Picaddily Line







