package android.ksigauke.com.rag.gamelist;

import android.ksigauke.com.rag.gamelist.repository.GameRepository;
import android.ksigauke.com.rag.model.Game;
import android.support.annotation.NonNull;

import java.util.List;

class GameListPresenter implements GameListContract.Presenter{

    private GameRepository gameRepository;
    private GameListContract.View gameView;

    public GameListPresenter(@NonNull GameRepository gameRepository, @NonNull GameListContract.View gameView){
        this.gameRepository = gameRepository;
        this.gameView = gameView;
    }

    @Override
    public void loadGames() {
        gameRepository.getAllGames(new GameRepository.LoadGamesCallback() {
            @Override
            public void onGamesLoaded(List<Game> loadedGames) {
                gameView.showGames(loadedGames);
            }
        });
    }
}
