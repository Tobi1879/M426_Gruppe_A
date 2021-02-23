package Invoker;

import Invoker.IOutputWriter;

public class TestOutputWriter implements IOutputWriter {
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
