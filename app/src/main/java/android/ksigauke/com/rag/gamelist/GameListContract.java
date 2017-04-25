package android.ksigauke.com.rag.gamelist;

import android.ksigauke.com.rag.model.Game;

import java.util.List;

interface GameListContract {

    interface View{
        void showGames(List<Game> games);
    }

    interface Presenter{
        void loadGames();
    }
}
