public class SingleTonP1 {
    static class JudgeAnalytics{
        private int run=0;
        private int submit=0;
        public void countRun(){
            run++;
        }
        public void countSubmit(){
            submit++;
        }
        public int getRunCount(){
            return run;
        }
        public int getSubmitCount(){
            return submit;
        }
    }

    public static void main(String[] args) {
         // Get the singleton instance
        JudgeAnalytics analytics = new JudgeAnalytics();

        analytics.countRun();
        analytics.countRun();
        analytics.countSubmit();

        System.out.println("Run count: " + analytics.getRunCount());      // 2
        System.out.println("Submit count: " + analytics.getSubmitCount()); // 1

        // Even if we get another instance, it’s the same object
        JudgeAnalytics another = new JudgeAnalytics();
        System.out.println("Run count from another: " + another.getRunCount()); // 2
    }
}
