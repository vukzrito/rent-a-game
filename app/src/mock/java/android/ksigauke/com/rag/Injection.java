package android.ksigauke.com.rag;

import android.ksigauke.com.rag.gamelist.repository.GameRepository;
import android.ksigauke.com.rag.gamelist.repository.InMemoryRepository;

public class Injection {
    public static GameRepository getGameRepository(){
        return new InMemoryRepository();
    }
}
