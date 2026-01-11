// Abstraction
interface RecommendationStrategy {
    void recommend();
}

// Concrete implementations
class TrendingRecommendation implements RecommendationStrategy {
    @Override
    public void recommend() {
        System.out.println("Recommending trending content");
    }
}

class GenreRecommendation implements RecommendationStrategy {
    @Override
    public void recommend() {
        System.out.println("Recommending content by genre");
    }
}

class RecentRecommendation implements RecommendationStrategy {
    @Override
    public void recommend() {
        System.out.println("Recommending recent content");
    }
}

// High-level module
class RecommendationAlgorithm {

    private RecommendationStrategy recommendationStrategy;

    // Constructor injection (preferred for DIP)
    public RecommendationAlgorithm(RecommendationStrategy recommendationStrategy) {
        this.recommendationStrategy = recommendationStrategy;
    }

    // Strategy can be changed at runtime
    public void setRecommendationStrategy(RecommendationStrategy recommendationStrategy) {
        this.recommendationStrategy = recommendationStrategy;
    }

    public void recommend() {
        recommendationStrategy.recommend();
    }
}  

public class DIP{
    public static void main(String[] args) {

        // Using Trending strategy
        RecommendationAlgorithm algorithm =
                new RecommendationAlgorithm(new TrendingRecommendation());
        algorithm.recommend();

        // Switching to Genre strategy at runtime
        algorithm.setRecommendationStrategy(new GenreRecommendation());
        algorithm.recommend();

        // Switching to Recent strategy
        algorithm.setRecommendationStrategy(new RecentRecommendation());
        algorithm.recommend();
    }
}
