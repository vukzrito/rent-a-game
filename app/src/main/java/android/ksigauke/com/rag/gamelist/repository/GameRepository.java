package android.ksigauke.com.rag.gamelist.repository;

import android.ksigauke.com.rag.model.Game;

import java.util.List;

public interface GameRepository {

    interface LoadGamesCallback{
        void onGamesLoaded(List<Game> loadedGames);
    }
    void getAllGames(LoadGamesCallback callback);
}
