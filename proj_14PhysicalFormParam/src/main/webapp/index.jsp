
<h1 style="text-align: center; color: red">PAYMENT PROCESSING FORM PAGE</h1>

<form action="rest/physicalform/param" method="POST" >
<pre>
CardNumber		:<input type="text"  name="cardNum" placeholder="XXXX-XXXX-XXXX-XXXX">
CardName		:<input type="text"  name="cardName" placeholder="drop card name">
Expiry Month		:<select name="expMonth">
  											<option value="Jan">Jan</option>
											  <option value="Feb">Feb</option>
  											<option value="March">March</option>
  											<option value="April">April</option>
  											<option value="may">Jan</option>
											  <option value="june">Feb</option>
  											<option value="july">March</option>
  											<option value="August">April</option>
  											<option value="sepetember">Jan</option>
											  <option value="October">Feb</option>
  											<option value="November">March</option>
  											<option value="December">April</option>
							</select>						
EXP YEAR		:<select name="expYear">
											<option value="2020">2020</option>
            							    <option value="2021">2021</option>
            							   <option value="2022">2022</option>
          					               <option value="2023">2023</option>
        					              <option value="2024">2024</option>
       						              <option value="2025">2026</option>
       						             <option value="2026">2027</option>
        				                 <option value="2027">2028</option>
   							</select>   

CVV 			:<input type="text"  name="cvv" placeholder="cvv">
Amount			:<input type= "text"  name="amt" placeholder="0.0">

		<input type="submit" value="pay  now">
</form>
</pre>
