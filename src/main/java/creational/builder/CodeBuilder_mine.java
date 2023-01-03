package creational.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CodeBuilder_mine
{
    private String  className;
    List<String> name = new ArrayList<>();
    List<String> type = new ArrayList<>();

    private final String newLine = System.lineSeparator();

    public CodeBuilder_mine(String className)
    {
        this.className = className;
    }

    public CodeBuilder_mine addField(String name, String type)
    {
       this.name.add(name);
       this.type.add(type);
       return this;
    }


    private String toStringImpl(int indent) {
        StringBuilder sb = new StringBuilder();
        String i = String.join("", Collections.nCopies(indent * 2, " "));
        sb.append(String.format("%spublic class %s", i, className));
        sb.append(String.format("%s{", newLine));
        sb.append(String.format("%s", newLine));
        for (int j = 0; j < name.size(); j++) {
            sb.append(String.format("%2spublic %s %s;%s", i, type.get(j), name.get(j), newLine));
        }
        sb.append("}");
        return sb.toString();
    }
    @Override
    public String toString()
    {
       return toStringImpl(0);
    }


    public static void main(String[] args) {
        CodeBuilder_mine cb = new CodeBuilder_mine("Person")
                .addField("name", "String")
                .addField("age", "int");
        System.out.println(cb);
    }
}