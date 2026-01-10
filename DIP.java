interface RecomendationStrategy{
    void recommend();
}

class TrendingRecommendation implements RecomendationStrategy{
    public void recommend(){

    }
}

class GenreRecommendation implements RecomendationStrategy{
    public void recommend(){
        
    }
}

class RecentRecommendation implements RecomendationStrategy{
    public void recommend(){

    }
}

class RecommendationAlgorihtm{
    private RecomendationStrategy recomendationStrategy;
    public void RecentRecommendation(RecomendationStrategy recomendationStrategy){
       this.recomendationStrategy=recomendationStrategy;
    }
}

public class DIP {
    public static void main(String[] args) {
        RecomendationStrategy recomendationStrategy=new TrendingRecommendation() ;
        recomendationStrategy.recommend();

        RecommendationAlgorihtm recommendationAlgorihtm=new RecommendationAlgorihtm new TrendingRecommendation()
    }

}
