package android.ksigauke.com.rag.gamelist;

import android.content.Context;
import android.ksigauke.com.rag.R;
import android.ksigauke.com.rag.model.Game;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

class GameAdapter extends RecyclerView.Adapter<GameAdapter.GameViewHolder> {

    private final Context context;
    private List<Game> games;
    private View.OnClickListener clickListener;

    GameAdapter(Context context, List<Game> games, View.OnClickListener clickListener) {
        this.context = context;
        this.games = games;
        this.clickListener = clickListener;
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    @Override
    public void onBindViewHolder(GameViewHolder holder, int position) {
        Game game = games.get(position);

        Glide.with(context).load(game.getImageUrl())
                .placeholder(R.drawable.default_game_img)
                .error(R.drawable.default_game_img)
                .into(holder.ivGameImage);

        holder.tvGameName.setText(game.getName());
        holder.tvGameDescription.setText(game.getDescription());
        holder.btnViewGame.setOnClickListener(clickListener);

    }

    @Override
    public GameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.game_list_item, parent, false);

        return new GameViewHolder(v);
    }

    class GameViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivGameImage;
        private TextView tvGameName;
        private TextView tvGameDescription;
        private Button btnViewGame;

        GameViewHolder(View itemView) {
            super(itemView);
            ivGameImage = (ImageView) itemView.findViewById(R.id.iv_game_image);
            tvGameName = (TextView) itemView.findViewById(R.id.tv_game_name);
            tvGameDescription = (TextView) itemView.findViewById(R.id.tv_game_description);
            btnViewGame = (Button) itemView.findViewById(R.id.btn_view_game);
            btnViewGame.setOnClickListener(clickListener);
        }
    }

    public void refresh(List<Game> games){
        if(this.games != null)
            this.games = games;
        notifyDataSetChanged();
    }

}
