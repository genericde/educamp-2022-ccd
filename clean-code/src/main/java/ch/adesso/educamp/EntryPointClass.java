package ch.adesso.educamp;

import ch.adesso.educamp.filereader.LocCounter;
import ch.adesso.educamp.schemaargs.ArgsParserIntegrator;

import java.io.IOException;

public class EntryPointClass {

    public static void main(String[] args) throws IOException {
        //FizzBuzzIntegration.runFizzBuzz();
        //LocCounter.countLoc(args[0]);

        String schema = "f?,j#,w*";
        char selection = 'w';
        ArgsParserIntegrator.getValueForSchema(args, schema, selection);
    }

}
