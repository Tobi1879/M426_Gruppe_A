package Tests;

import Commands.ShellCommand;
import Factory.CommandFactory;
import Invoker.IOutputWriter;
import Invoker.TestOutputWriter;
import org.junit.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class VerCommandTest {
    @Test
    public void testStandardInput() throws IOException {
        IOutputWriter testOutputWriter = new TestOutputWriter();
        ShellCommand shellCommand = CommandFactory.CreateCommand("ver", null);
        shellCommand.Execute(testOutputWriter);
        assertEquals(((TestOutputWriter) testOutputWriter).getOutput(), "Windows 10 Version: 10.0\n");
    }

    @Test
    public void testInputWithUpperCases() throws IOException {
        IOutputWriter testOutputWriter = new TestOutputWriter();
        ShellCommand shellCommand = CommandFactory.CreateCommand("vEr", null);
        shellCommand.Execute(testOutputWriter);
        assertEquals(((TestOutputWriter) testOutputWriter).getOutput(), "Windows 10 Version: 10.0\n");
    }
}