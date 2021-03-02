package Invoker;

import Invoker.IOutputWriter;

public class TestOutputWriter implements IOutputWriter {
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    String output = "";
    @Override
    public void Print(String text) {
        output = text;
    }

    @Override
    public void PrintLine(String text) {
        output = text;
    }
}
