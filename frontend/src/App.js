import './App.css';
import React, { useState } from 'react';


function App() {
  const [inputValue,setInputValue] = useState('');
  const handleChange = (e) => {
    setInputValue(e.target.value);
  };
  return (
    <div style={{ padding: '20px' }}>
    <label htmlFor="userInput">Enter something: </label>
      <input id="userInput" type="text" value={inputValue} onChange={handleChange} placeholder="Type here..." style={{ padding: '8px', fontSize: '16px', marginLeft: '10px' }} />
      <p>You typed: {inputValue}</p>
    </div>
  );
}

export default App;
