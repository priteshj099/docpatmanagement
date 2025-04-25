import {Link} from 'react-router-dom'

import Header from '../Header'
import './index.css'

const Home = () => (
    <>
    <Header />
    <div className='home-main-div'>
     <div>
        <img
          src="https://res.cloudinary.com/dakmxu3dl/image/upload/v1737546138/IMG_2026_eghfp3.jpg"       
          alt="course"
          className="web-mb-img"
        />
      </div> 

      <div>
        <p className="home-p">
          ONLINE<span style={{color: '#4560db', marginLeft: '10px'}}>DOCTOR</span>
        </p>
        <h1 className="home-h1">
          Find The Good Life With Good Health.
        </h1>
        <p className="home-p desc">
         Need to see a doctor now? you have come to the right place.
        </p>
        <Link to="/doctors" className="link">
          <button type="button" className="link-btn">
            FIND DOCTORS
          </button>
        </Link>
      </div>

      <div>
        <img
          src="https://res.cloudinary.com/dakmxu3dl/image/upload/v1737546138/IMG_2026_eghfp3.jpg"       
          alt="course"
          className="web-img"
        />
      </div>
    </div>
    </> 
    )

export default Home