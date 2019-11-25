package commons;

import com.opencsv.CSVWriter;
import models.Villa;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class FunctionWriteFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static final String pathVilla = "src/data/Villa.csv";
    private static String[] headerRecordVilla = new String[]{"id", "nameService", "numberOfFloors", "groundArea", "poolArea", "maxNumberOfTenants", "roomStandard", "rentalPeriod", "rentalCost", "description"};
//    String id, String nameService, int numberOfFloors, float groundArea, float poolArea, int maxNumberOfTenants, String roomStandard, String rentalPeriod, float rentalCost, String description
    public static void writeVillaToFileCSV(ArrayList<Villa> arrayList) {
        try (Writer writer = new FileWriter(pathVilla);
             CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)
        ) {
            csvWriter.writeNext(headerRecordVilla);
            for (Villa villa : arrayList) {
                csvWriter.writeNext(new String[]{
                    villa.getId(),villa.getNameService(),String.valueOf(villa.getNumberOfFloors()),String.valueOf(villa.getGroundArea()),String.valueOf(villa.getPoolArea()), String.valueOf(villa.getMaxNumberOfTenants()),villa.getRoomStandard(),villa.getRentalPeriod(),villa.getDescription()
                });

            }
        } catch (IOException ex) {

        }

    }
}
