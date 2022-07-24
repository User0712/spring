package com.xinqing.entity;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-12 23:10
 */
public class Command {
    private int Cmd_ID;
    private String Cmd_Name;
    private String Cmd_Describe;

    public Command(int Cmd_ID, String Cmd_Name, String Cmd_Describe){
        this.Cmd_ID = Cmd_ID;
        this.Cmd_Name = Cmd_Name;
        this.Cmd_Describe = Cmd_Describe;

    }

    public int getCmd_ID(){
        return this.Cmd_ID;
    }
    public String getCmd_Name(){
        return this.Cmd_Name;
    }
    public String getCmd_Describe(){
        return this.Cmd_Describe;
    }

    public void setCmd_ID(int cmd_ID) {
        this.Cmd_ID = cmd_ID;
    }

    public void setCmd_Name(String cmd_Name) {
        this.Cmd_Name = cmd_Name;
    }

    public void setCmd_Describe(String cmd_Describe) {
        this.Cmd_Describe = cmd_Describe;
    }

    @Override
    public String toString() {
        return "Commond{" +
                "Cmd_ID=" + Cmd_ID +
                ", Cmd_Name='" + Cmd_Name + '\'' +
                ", Cmd_Describe='" + Cmd_Describe + '\'' +
                '}';
    }
}
