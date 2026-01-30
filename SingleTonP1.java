public class SingleTonP1 {
    // static class JudgeAnalytics{
    //     private int run=0;
    //     private int submit=0;
    //     public void countRun(){
    //         run++;
    //     }
    //     public void countSubmit(){
    //         submit++;
    //     }
    //     public int getRunCount(){
    //         return run;
    //     }
    //     public int getSubmitCount(){
    //         return submit;
    //     }
    // }
    
    //eager loading
    // static class JudgeAnalytics{
    //     private static final JudgeAnalytics judgeAnalytics=new JudgeAnalytics();
    //     private JudgeAnalytics(){
    //     }
    //     public static JudgeAnalytics getInstance(){
    //         return judgeAnalytics;
    //     }
    // }
    
    //lazy loading--not thread safe..multi-thread creates two object...create object at time of call unlike eager loading
    // static class JudgeAnalytics{
    //     private static JudgeAnalytics judgeAnalytics;
    //     private JudgeAnalytics(){
    //     }
    //     public static JudgeAnalytics getInstance(){
    //         if(judgeAnalytics==null){
    //             judgeAnalytics =new JudgeAnalytics();
    //         }
    //         return judgeAnalytics;
    //     }
    // }
  
    //syncronized keyword
    // cons--speed is slow....checking sync ...inefficient way..thread safe
    // static class JudgeAnalytics{
    //     private static JudgeAnalytics judgeAnalytics;
    //     private JudgeAnalytics(){
    //     }
    //     public static synchronized JudgeAnalytics getInstance(){
    //         if(judgeAnalytics==null){
    //             judgeAnalytics =new JudgeAnalytics();
    //         }
    //         return judgeAnalytics;
    //     }
    // }  
    

    //double-checked locking
    //volatile keyword--
    //thread safe...on call...double check mechanism...
    // static class JudgeAnalytics{
    //     private static volatile JudgeAnalytics judgeAnalytics;
    //     private JudgeAnalytics(){
    //     }
    //     public  JudgeAnalytics getInstance(){
    //         if(judgeAnalytics==null){
    //             synchronized(JudgeAnalytics.class){
    //                if(judgeAnalytics==null){
    //                   judgeAnalytics=new JudgeAnalytics();                   }
    //             }
    //         }
    //         return judgeAnalytics;
    //     }
    // }


     
    //Bill pugh singleton//recommended for java 5+
    //thread safe....on first call...efficient,lazy,safe....cons-none

    static class JudgeAnalytics{
        private JudgeAnalytics(){
        }
       
        private static class Holder{
            private static final JudgeAnalytics judgeAnalytics =new JudgeAnalytics();
        }

        public static JudgeAnalytics getInstance(){
            return Holder.judgeAnalytics;
        }
    }

    public static void main(String[] args) {
         // Get the singleton instance
        // JudgeAnalytics analytics = new JudgeAnalytics();

        // analytics.countRun();
        // analytics.countRun();
        // analytics.countSubmit();

        // System.out.println("Run count: " + analytics.getRunCount());      // 2
        // System.out.println("Submit count: " + analytics.getSubmitCount()); // 1

        // // Even if we get another instance, it’s the same object
        // JudgeAnalytics another = new JudgeAnalytics();
        // System.out.println("Run count from another: " + another.getRunCount()); // 2

        // JudgeAnalytics judge=JudgeAnalytics.getInstance();
        // JudgeAnalytics judge2=JudgeAnalytics.getInstance();
        // System.out.println(judge);
        // System.out.println(judge2);
    }
}

