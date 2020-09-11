public class Man {
    private  Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void live(){
        activity.doit();
    }
}
