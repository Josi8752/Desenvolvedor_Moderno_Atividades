import './styles.css';
import CatalogCard from "../../components/CatalogCard";
import Header from "../../components/Header";
import SearchBar from "../../components/SearchBar";


export default function Carrostop() {

    return (

        <>
            <Header />
            <main>
                <section id="catalogcarrostop-section" className="cartop-container">
                    <div className="cartop-search-bar-container" >
                    <SearchBar/>
                    </div>
                
                    <div className="cartop-container-cards">
                        <CatalogCard />
                        <CatalogCard />
                        <CatalogCard />
                        <CatalogCard />
                        <CatalogCard />
                        <CatalogCard />
                        <CatalogCard />
                        <CatalogCard />
                        <CatalogCard />
                        <CatalogCard />
                        <CatalogCard />
                        <CatalogCard />
             
                    </div>
                 
                </section>
            </main>
        </>
    )
}