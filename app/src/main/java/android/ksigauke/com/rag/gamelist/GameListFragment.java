package android.ksigauke.com.rag.gamelist;


import android.ksigauke.com.rag.Injection;
import android.ksigauke.com.rag.model.Game;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.ksigauke.com.rag.R;

import java.util.ArrayList;
import java.util.List;

public class GameListFragment extends Fragment implements GameListContract.View {

    private GameAdapter gameAdapter;
    private GameListContract.Presenter gameListPresenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_game_list, container, false);
        RecyclerView recyclerView = (RecyclerView)root.findViewById(R.id.rv_game_list);

        GridLayoutManager layoutManager = new GridLayoutManager(getContext(),1);
        recyclerView.setAdapter(gameAdapter);
        recyclerView.setLayoutManager(layoutManager);

        return root;
    }

    public GameListFragment(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameAdapter = new GameAdapter(getContext(), new ArrayList<Game>(0),new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Add functionality to go to game view.
            }
        });
        gameListPresenter = new GameListPresenter(Injection.getGameRepository(), this);
    }

    @Override
    public void onResume(){
        super.onResume();
        gameListPresenter.loadGames();
    }

    public static GameListFragment newInstance(){
        return new GameListFragment();
    }

    @Override
    public void showGames(List<Game> games) {
        gameAdapter.refresh(games);
    }
}
