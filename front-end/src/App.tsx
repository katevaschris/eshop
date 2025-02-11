import { useState } from 'react'
import reactLogo from './assets/react.svg'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
        <div className="div-header">
            <h1 className="App-header">
                Eshop <a href="https://www.youtube.com/watch?v=k8JflBNovLE">Pepegoleni</a>
            </h1>
        </div>

      <div>
          <a href="https://www.youtube.com/watch?v=k8JflBNovLE" target="_blank">
              <img src={reactLogo} className="logo react" alt="React logo" />
          </a>
          <a href="https://www.youtube.com/watch?v=k8JflBNovLE" target="_blank">
              <img src={reactLogo} className="logo react" alt="React logo" />
          </a>
          <a href="https://www.youtube.com/watch?v=k8JflBNovLE" target="_blank">
              <img src={reactLogo} className="logo react" alt="React logo" />
          </a>
          <a href="https://www.youtube.com/watch?v=k8JflBNovLE" target="_blank">
              <img src={reactLogo} className="logo react" alt="React logo" />
          </a>


      </div>

        <div className="sifsa">
            <a href="https://www.youtube.com/watch?v=k8JflBNovLE" target="_blank">
                <img src={reactLogo} className="logo react" alt="React logo" />
            </a>
        </div>

      <div className="card">
        <button onClick={() => setCount((count) => count + 2)}>
          count is {count}
        </button>
      </div>
    </>
  )
}

export default App
