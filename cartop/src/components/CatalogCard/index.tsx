import './styles.css';
import carImg from '../../assets/car.png';
import CarBtn from '../btn';


export default function CatalogCard() {
    return (


        <div className="cartop-card">

            <img src={carImg} alt="Carro" />

            <h3>Audi Supra TT</h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Cupiditate, nisi</p>
            <div>
                <CarBtn />
            </div>

        </div>

    );
}