package sample.heavy.dagger2.home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import sample.heavy.dagger2.R;
import sample.heavy.dagger2.data.Car;

public class HomeFragment extends Fragment implements HomeContract.IHomeView, View.OnClickListener {

    HomeContract.IHomePresenter mHomePresenter;

    private TextView mTvCarInstruction;
    private Button mBtnNextCar;

    public HomeFragment() {

    }

    @SuppressLint("ValidFragment")
    public HomeFragment(HomeContract.IHomePresenter presenter) {
        mHomePresenter = presenter;
    }


    @Override
    public void onResume() {
        super.onResume();
        mHomePresenter.takeView(this);
        mHomePresenter.start();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        mTvCarInstruction = view.findViewById(R.id.tv_car_instruction);
        mBtnNextCar = view.findViewById(R.id.btn_next_car);
        mBtnNextCar.setOnClickListener(this);
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mHomePresenter.dropView();
    }

    @Override
    public void showCar(Car car) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Car : ").append("\n")
                .append("Name : ").append(car.getName()).append("\n")
                .append("Engine cylinders : ").append(car.getEngine().getCylinderNumbers());
        mTvCarInstruction.setText(stringBuilder.toString());
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_next_car) {
            mHomePresenter.nextRandomCar();
        }
    }
}
