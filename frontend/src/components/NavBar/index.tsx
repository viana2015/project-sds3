import ImgDsDark from 'assets/img/ds-dark.svg'
import { Link } from 'react-router-dom';
//import ImgSuaLogo from 'assets/img/sua-logo.jpeg'
const NavBar = () => {
  return (
    <div className="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-light border-bottom shadow-sm">
      <div className="container">
        <nav className="my-2 my-md-0 mr-md-3">
          <Link to="/">
            <img src={ImgDsDark} alt="SuaLogo" width="120" />
          </Link>
        </nav>
      </div>
    </div>
  );
}

export default NavBar;