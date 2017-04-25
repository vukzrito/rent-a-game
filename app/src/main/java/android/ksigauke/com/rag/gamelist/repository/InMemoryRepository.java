package android.ksigauke.com.rag.gamelist.repository;

import android.ksigauke.com.rag.model.Game;

import java.util.ArrayList;
import java.util.List;

public class InMemoryRepository implements GameRepository {

    private static final List<Game> GAMES = initGames();
    private static final List<Game> EMPTY_GAME_LIST = new ArrayList<>();

    @Override
    public void getAllGames(final LoadGamesCallback callback) {
        callback.onGamesLoaded(GAMES);
    }

    static List<Game> initGames() {
        ArrayList<Game> games = new ArrayList<>();

        Game g = new Game("Call Of Duty Black Ops II", new String[]{"Action", "First Person Shooter"}, new String[]{"PS3", "PS4", "Xbox"},
                "Call of Duty: Black Ops II is a first-person shooter video game, developed by Treyarch and published by Activision.");
        g.setImageUrl("http://wallpapercave.com/wp/Pzb3zCA.jpg");
        games.add(g);

        g = new Game("Mortal Kombat", new String[]{"Action"}, new String[]{"Playstation 4", "Playstation 3", "Xbox One"},
                "Mortal Kombat X is a fighting video game developed by NetherRealm Studios and published by Warner Bros. Interactive Entertainment.");
        g.setImageUrl("http://www.mobygames.com/images/covers/l/303713-mortal-kombat-x-playstation-4-front-cover.jpg");
        games.add(g);

        return games;
    }
}
